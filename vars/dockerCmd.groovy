def call(String cmd, String args, def optional = [:]) {
    config = BuildConfig.resolve(optional)

    if (config.noCache == "yes") {
        args = "--no-cache " + args;
    }
    sh(script: "docker ${cmd} ${args}")
}