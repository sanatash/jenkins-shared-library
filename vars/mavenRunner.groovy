def call(String podLabel, code) {
	podTemplate(label: podLabel,
	containers: [containerTemplate(name: 'maven', image: 'image: maven:3.3.9-jdk-8-alpine', command: 'cat', ttyEnabled: true)
	       ]) {
		code()
	}
}