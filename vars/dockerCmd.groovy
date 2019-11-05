def call(args, cache) {
    assert args != null
    assert cache != null
    if(cache.equals("yes")) {
        println(args)
//        args = "--no-cache " + args
        sh(script: "docker ${args}")
    }
}