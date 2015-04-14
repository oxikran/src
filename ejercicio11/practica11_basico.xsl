<?xml version="1.0" encoding="UTF-8" ?>

<!-- New document created with EditiX at Thu Apr 26 12:46:55 BST 2012 -->

<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:mi="http://misitio.com">
	<xsl:output method="html" indent="yes" />
	<xsl:template match="/">
		<html>
			<head>
				<title>Alumnos del instituto</title>
				<link rel="stylesheet" type="text/css" href="estilo.css" />
			</head>
			<body>
				<h1>Lista de nombres y apellidos</h1>
				<xsl:apply-templates select="/mi:instituto/curso/alumno" />


				<h1>Lista de ciales y curso</h1>
				<xsl:apply-templates select="/mi:instituto/curso/alumno"
					mode="mostrarCiales" />
			</body>
		</html>
	</xsl:template>
	<xsl:template match="alumno">
		<table>
			<tr class="cabecera">
				<td>
					Nombre
				</td>
				<td>
					Apellidos
				</td>
			</tr>
			<tr>
				<td>
					<b>
						<xsl:value-of select="nombre" />
					</b>
				</td>
				<td>
					<xsl:value-of select="./apellidos" />
				</td>
			</tr>
		</table>
	</xsl:template>
	<xsl:template match="alumno" mode="mostrarCiales">
		<table>
			<tr class="cabecera">
				<td>
					Cial
				</td>
				<td>
					Curso
				</td>
			</tr>
			<tr>
				<td>
					<b>
						<xsl:value-of select="@cial" />
					</b>
				</td>
				<td>
					<xsl:value-of select="../@nombre" />
				</td>
			</tr>
		</table>
	</xsl:template>
</xsl:stylesheet>
