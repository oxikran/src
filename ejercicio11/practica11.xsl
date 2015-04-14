<?xml version="1.0" encoding="UTF-8" ?>

<!-- New document created with EditiX at Thu Apr 26 12:46:55 BST 2012 -->

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:mi="http://misitio.com">
	<xsl:output method="html" indent="yes"/>
	<xsl:template match="/">
		<html>
			<head>
				<title>Alumnos del instituto</title>
				<link rel="stylesheet" type="text/css" href="estilo.css"/>
			</head>
			<body>
				<h1>Lista de nombres y apellidos</h1>
				<table>
					<tr class="cabecera" >
						<td>
							Nombre
						</td>
						<td>
							Apellidos
						</td>
						<td>
							Curso
						</td>
					</tr>
					<xsl:apply-templates select="/mi:instituto/curso/alumno">
						<xsl:sort select="apellidos"/>
					</xsl:apply-templates>
				</table>
				<h1>Lista de ciales y curso</h1>
				<table>
					<tr class="cabecera" >
						<td>
							Cial
						</td>
						<td>
							Curso
						</td>
					</tr>
					<xsl:apply-templates select="/mi:instituto/curso/alumno" mode="mostrarCiales"/>
				</table>
			</body>
		</html>
	</xsl:template>
	<xsl:template match="alumno">
		<tr>
			<td>
				<b>
					<xsl:value-of select="nombre"/>
				</b>
			</td>
			<td>
				<xsl:value-of select="./apellidos"/>
			</td>
			<td>
				<xsl:value-of select="../@nombre"/>
			</td>
		</tr>
	</xsl:template>
	<xsl:template match="alumno" mode="mostrarCiales">
		<tr>
			<td>
				<b>
					<xsl:value-of select="@cial"/>
				</b>
			</td>
			<td>
				<xsl:value-of select="../@nombre"/>
			</td>
		</tr>
	</xsl:template>
</xsl:stylesheet>
