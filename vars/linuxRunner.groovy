def call(String podLabel, code) {
	podTemplate(label: podLabel, containers: [containerTemplate(name: 'centos', image: 'centos:7', command: 'cat', ttyEnabled: true),
	                                     containerTemplate(name: 'ubuntu', image: 'ubuntu:latest', command: 'cat', ttyEnabled: true)]) {
		code()
	}
}