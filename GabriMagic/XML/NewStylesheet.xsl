<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<ciales>
			<xsl:apply-templates select="//curso/alumno"/>
		</ciales>
	</xsl:template>


  <xsl:template match="alumno">
           <alumno>  
          	<cial>
          		<xsl:value-of select="@cial"/>
           	</cial>
             <datos>
             	 <xsl:value-of select="nombre"/>-<xsl:value-of select="apellidos"/>
              </datos>  
             <curso>
             	<xsl:value-of select="../@nombre"/>
             </curso>   
            </alumno>     
          </xsl:template> 	
     </xsl:stylesheet>  