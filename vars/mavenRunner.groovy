def call(String podLabel, String mavenVersion, code) {
	podTemplate(label: podLabel,
	containers: [containerTemplate(name: 'maven', image: "maven:${mavenVersion}", ttyEnabled: true)
	       ]) {
		code()
	}
}