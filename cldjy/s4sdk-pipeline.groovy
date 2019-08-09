steps:
  mtaBuild:
    buildTarget: 'CF'
    mtaJarLocation: '/opt/sap/mta.jar'
 cloudFoundryDeploy:
    cloudFoundry:
      credentialsId: 'CF'
      apiEndpoint: '<CF Endpoint>'
      org: '<CF Organization>'
      space: 'DevSpace001'