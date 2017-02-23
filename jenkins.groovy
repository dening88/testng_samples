node() {
    currentBuild.displayName += " ${test_suites}"

    stage 'Git checkout'
            git branch: 'master', url: 'https://github.com/dening88/testng_samples.git'
}