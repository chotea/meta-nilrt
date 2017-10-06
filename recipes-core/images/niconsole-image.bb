DESCRIPTION = "Runmode image for ethernet based, console only, NI Linux Realtime targets."

IMAGE_INSTALL = "\
	packagegroup-ni-base \
	packagegroup-ni-tzdata \
	packagegroup-ni-runmode \
	packagegroup-ni-wifi \
	"

IMAGE_FSTYPES = "tar.bz2"

require niconsole-image.inc
require include/licenses.inc