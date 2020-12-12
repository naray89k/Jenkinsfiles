def buildApp(version) {
    echo "Building the application"
    echo "version: ${version}"
}

def testApp(version) {
    echo "Testing the application"
    echo "version: ${version}"
}

def deployApp(version) {
    echo "Deploying the application"
    echo "version: ${version}"
}

return this