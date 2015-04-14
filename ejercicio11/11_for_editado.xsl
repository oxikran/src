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
					<table>
						<tr class="cabecera">
							<td>Nombre</td>
							<td>Apellidos</td>
							<td>Notas</td>
							<td>Nota Media</td>
						</tr>
						<tr>
							<xsl:apply-templates select="/mi:instituto/curso/alumno" />
						</tr>
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
							<xsl:call-template name="muestraCial" />
						</xsl:for-each>
					</table>
				</body>
			</html>
		</xsl:template>
		<xsl:template name="muestraCial">
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
		</xsl:template>
		<xsl:template match="alumno">
			<td>
			
			</td>
			<td>
				<xsl:apply-templates select="/mi:instituo/curso/alumno" />
			</td>
		</xsl:template>
		<xsl:template match="notas">
			
		</xsl:template>
	</xsl:stylesheet>
	