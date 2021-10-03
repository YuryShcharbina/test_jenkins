import jenkins.model.JenkinsLocationConfiguration
jlc = JenkinsLocationConfiguration.get()
jlc.setUrl("http://192.168.56.200:8080/")
jlc.save()
