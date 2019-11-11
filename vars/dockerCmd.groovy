import com.onurersen.jenkins.BuildConfig


def call(def body = [:]) {
    config = BuildConfig.resolve(body)

    println(config)
    assert args != null
    assert cmd != null
    assert withoutCache != null
    if (cmd.equals("build")) {
        if (withoutCache.equals("yes")) {
            args = "--no-cache " + args
            sh(script: "docker ${cmd} ${args}")
        }
    } else {
        sh(script: "docker ${cmd} ${args}")
    }
}