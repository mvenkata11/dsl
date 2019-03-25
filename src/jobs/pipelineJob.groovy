pipelineJob("pipeline") {
	description("jenkinspipeline")
	keepDependencies(false)
	definition {
		cpsScm {
			scm {
				git {
					remote {
						github("mvenkata11/dsl", "https")
					}
					branch("*/master")
				}
			}
			scriptPath("Jenkinsfile")
		}
	}
	disabled(false)
	configure {
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://github.com/mvenkata11/dsl.git/')
			displayName()
		}
	}
}
