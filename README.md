# Creating an auto scalable cluster using CloudFormation

* Create a cluster with name "mahto"
** Assumption:
*** A key with name "sandy" already exists
*** An S3 bucket already exists ```https://s3.amazonaws.com/ot-cfn-template/infrastructure```
```make cluster-name=mahto create-cluster key-name=sandy```
* Delete a cluster with name "mahto"
** Assumption: A cluster with name "mahto" already exists, created via our utility
