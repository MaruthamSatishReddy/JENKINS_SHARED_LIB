def call(credentialsId)
{
    waitForQualityGate abortPipeline: true, credentialsId: 'SonarQube'
}
