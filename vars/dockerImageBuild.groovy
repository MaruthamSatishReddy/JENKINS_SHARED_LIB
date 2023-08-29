def call(String serviceName,String dockerImageTag,String dockerHubUser){
    sh """ 
    docker image build -t ${dockerHubUser}/${serviceName} .
    docker image tag ${dockerHubUser}/${serviceName} ${dockerHubUser}/${serviceName}:${dockerImageTag}
    docker image tag ${dockerHubUser}/${serviceName} ${dockerHubUser}/${serviceName}:latest
    """
}
