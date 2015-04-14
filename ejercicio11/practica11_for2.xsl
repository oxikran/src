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
					<tr class="cabecera">
						<td>Nombre</td>
						<td>Apellidos</td>
					</tr>
					<xsl:for-each select="/mi:instituto/curso/alumno">
						<tr>
							<td>
								<xsl:value-of select="nombre"/>
							</td>
							<td>
								<xsl:value-of select="./apellidos"/>
							</td>
						</tr>
					</xsl:for-each>
				</table>
				<h1>Lista de ciales y curso</h1>
				<table>
					<tr class="cabecera">
						<td>
							<xsl:text>Cial</xsl:text>
						</td>
						<td>
							<xsl:text>Curso</xsl:text>
						</td>
					</tr>
					<xsl:for-each select="/mi:instituto/curso/alumno">
						<xsl:call-template name="muestraCial">
							<xsl:with-param name="nodoAlumno" select="."/>
						</xsl:call-template>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
	<xsl:template name="muestraCial">
		<xsl:param name="nodoAlumno"/>
		<tr>
			<td>
				<xsl:value-of select="$nodoAlumno/@cial"/>
			</td>
			<td>
				<xsl:value-of select="$nodoAlumno/../@nombre"/>
			</td>
		</tr>
	</xsl:template>
</xsl:stylesheet>
