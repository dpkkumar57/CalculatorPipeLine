pipeline{
agent any
stages{
stage("Clening Stage"){
steps {
bat "mvn clean"
}
}
stage("Testing Stage"){
steps {
bat "mvn test"
}
}
stage("Packageing Stage"){
steps {
bat "mvn package"
}
}

}
}
