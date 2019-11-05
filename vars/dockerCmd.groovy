def call(args, cache) {
    assert args != null
    assert cache != null
    if(cache.equals("yes")) {
        args += " --no-cache"
        sh(script: "docker ${args}")
    }
}