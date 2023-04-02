def call(String podLabel, code) {
	podTemplate(label: podLabel, containers: [containerTemplate(name: 'centos', image: 'centos:7', ttyEnabled: true),
	                                     containerTemplate(name: 'ubuntu', image: 'ubuntu:latest', ttyEnabled: true)]) {
		code()
	}
}