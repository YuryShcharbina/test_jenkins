import jenkins.model.Jenkins

Integer numberOfExecutors = 1

Jenkins jenkins = Jenkins.getInstance()

jenkins.setNumExecutors(numberOfExecutors)

jenkins.save()
