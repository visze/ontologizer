+++
title = "Webstart"
weight = 5
+++

The Ontologizer can be started directly from this website using Java webstart by
clicking on the following icon:

<center>
[![Webstart](/images/webstart.jpg)](/webstart/ontologizer.jnlp)
</center>

Webstart applications are started directly from a web browser, which downloads the
program code to the local computer. If the code has already been downloaded, the
browser checks if the server has a newer version. If not, the local copy of the
program is started. Further information is available at Sun's webstart site.

For users, webstart means that the webbrowser will automatically download and
use the latest available version of the webstart program, so users will automatically
benefit from updates and bugfixes. Once the current version of the program has been
downloaded, the program will start essentially as quickly as a traditional desktop
application.

Troubles
--------

The Java may refuse to start Ontologizer using Webstart facility as the binaries
are only self-signed. To circumvent this problem, the most easy solution is to add the
site `http://ontologizer.de` to the *Exception Site List* under the *Security*
tab within the *Java Control Panel* application. See
https://www.java.com/de/download/help/jcp_security.xml for details.
