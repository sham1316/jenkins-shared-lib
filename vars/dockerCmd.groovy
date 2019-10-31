def call(args) {
    assert args != null
    sh(script: "docker ${args}")
}