def call(String podLabel, String centosVersion, String ubuntuVersion, code) {
	podTemplate(label: podLabel, containers: [containerTemplate(name: 'centos', image: 'centos:${centosVersion}', ttyEnabled: true),
	                                     containerTemplate(name: 'ubuntu', image: 'ubuntu:${ubuntuVersion}', ttyEnabled: true)]) {
		code()
	}
}