<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">


<xsl:output method="html"/>
  
	<xsl:template match="/">
		<html>
			<body>
				<h1>Lista de Programas</h1>
				<programas>
				<xsl:for-each select="rss/channel/item">
					
					<item>
						<titulo><xsl:copy-of select="title"/></titulo>
						<!-- 
						<xsl:value-of select="link"/>
						<xsl:value-of select="pubDate"/>
						 -->
					</item>
					
				</xsl:for-each>
				</programas>
			</body>
		</html>
		
		
		
		
		
		
		
		
		
		
		
		
		
	</xsl:template>
</xsl:stylesheet>







<!-- http://api.rtve.es/api/programas/22332/audios.rss -->