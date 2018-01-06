pipelineJob('Build-Images-And-Push-To-ECR') {
  parameters {
    stringParam('REPOSITORY_CLONE_ADDRESS', 'git@github.com:opstree-aws-utils/ecs-cfn.git', 'ssh clone address of the repository where dockerfile is present')
    stringParam('BRANCH_NAME', 'master', 'branch name to build the docker image')
    stringParam('REGISTRY_NAME', 'https://405349833286.dkr.ecr.us-east-1.amazonaws.com/jenkins', 'name of the ecr')
  }
  environmentVariables {
      env('slaveName', slaveName)
  }

  definition {
    cps {
      script(readFileFromWorkspace('jobs/pipeline/build_docker_images.groovy'))
      sandbox()
    }
  }
}
