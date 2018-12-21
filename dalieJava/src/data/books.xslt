<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0"
 xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
 exclude-result-prefixes="xsl">

<xsl:output method="xml" indent="yes" cdata-section-elements="test"/>

<xsl:template match="buecher">
<results>
	<xsl:for-each select="buch/autor">
		<result>
			<xsl:copy-of select="../titel"/>
			<xsl:copy-of select="."/>
		</result>
	</xsl:for-each>
</results>
</xsl:template>

</xsl:stylesheet>
