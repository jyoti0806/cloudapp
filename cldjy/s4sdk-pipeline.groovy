steps:
  mtaBuild:
    buildTarget: 'NEO'
    mtaJarLocation: '/opt/sap/mta.jar'
  neoDeploy:
    neoHome: '/opt/sap/neo-sdk/'
    neo:
      credentialsId: 'NEO_DEPLOY'
      account: 'your-account-id'
      host: 'hana.ondemand.com'