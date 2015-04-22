<?xml version="1.0" encoding="UTF-8"?>
<!-- ?xml-stylesheet type="text/css" href="estilos.css"?> -->


<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html" indent="yes"/>

	<xsl:template match="/">
		
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
			<link rel="stylesheet" type="text/css" href="estilos.css"  />
			 <title>Intituto</title>
		</head>
		
		<html>
			<body>
				<table border="1	0">
					<tr style="background-color:#00F5FF">
						<td >Nombre</td>
						<td>Apellidos</td>
						<td>Asignatura</td>
					</tr >

					<!--xsl:for-each select="instituto/curso/alumno"-->
					
					<xsl:for-each select="instituto/curso/alumno [contains(translate(upper-case(apellido])','ÈÉ','EE'), 'PEREZ')]">
						<tr>
							<td class="nombre">
								<xsl:value-of select="nombre" />
							</td>
							<td>
								<xsl:value-of select="apellidos" />
							</td>
							<td>
								<ol class="notas">
									<xsl:for-each select="notas/asignatura">
										<!--xsl:number count="alumno" values="single" /-->
										<li><xsl:value-of select="." />:  <xsl:value-of select="following-sibling::nota" /></li>
									</xsl:for-each>
								</ol>
							</td>
							<!-- <td> <xsl:value-of select="asignatura" />< /td> -->
						</tr>
					</xsl:for-each>

				</table>
			</body>
		</html>













	</xsl:template>
</xsl:stylesheet>