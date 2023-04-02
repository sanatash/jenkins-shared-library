def call(String podLabel, code) {
	podTemplate(label: podLabel,
	containers: [containerTemplate(name: 'maven', image: 'image: maven:latest', ttyEnabled: true)
	       ]) {
		code()
	}
}