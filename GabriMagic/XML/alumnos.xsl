<?xml version="1.0" encoding="UTF-8"?>
<!-- ?xml-stylesheet type="text/css" href="estilos.css"?> -->


<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html" />

	<xsl:template match="/">
		
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
			<link href="estilos.css" rel="stylesheet" type="text/css" />
			 <title>Intituto</title>
		</head>
		
		<html>
			<body>
				<table>
					<tr>
						<td>Nombre</td>
						<td>Apellidos</td>
						<td>Asignatura</td>
					</tr>

					<xsl:for-each select="instituto/curso/alumno">
						<tr>
							<td>
								<xsl:value-of select="nombre" />
							</td>
							<td>
								<xsl:value-of select="apellidos" />
							</td>
							<!-- <td> <xsl:value-of select="asignatura" />< /td> -->
						</tr>
					</xsl:for-each>

				</table>
			</body>
		</html>













	</xsl:template>
</xsl:stylesheet>