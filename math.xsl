<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
  <html>
  <head>
  <style>
  	tr,td{
  	border: 1px solid black;
  	padding:10px;
  	}
  	th{
  		border: 2px solid black;
  		padding:15px;
  	}
  	h2{
  	text-align:center;
  	}
  	body{
  	background-color:cadetblue;
  	}
  </style>
  </head>
  <body>
  <h2 style="margin-top:20px">Math Courses</h2>
  <div style="height:80vh;overflow-y:scroll">
  <table style="border-collapse: collapse;background-color: #dee5f2;text-align:center; width:90%;margin:auto;">
    <tr>
      <th>Title</th>
      <th>Subject</th>
      <th>Course</th>
      <th>Instructor</th>
      <th>Reg_num</th>
      <th>Section</th>
      <th>Units</th>
      <th>Days</th>
      <th>Start_time</th>
      <th>End_time</th>
      <th>Building</th>
      <th>Room</th>
    </tr>
    <xsl:for-each select="root/course[subj='MATH']">
    <tr>
      <td><xsl:value-of select="title"/></td>
      <td><xsl:value-of select="subj"/></td>
      <td><xsl:value-of select="crse"/></td>
      <td><xsl:value-of select="instructor"/></td>
      <td><xsl:value-of select="reg_num"/></td>
      <td><xsl:value-of select="sect"/></td>
      <td><xsl:value-of select="units"/></td>
      <td><xsl:value-of select="days"/></td>
      <td><xsl:value-of select="time/start_time"/></td>
      <td><xsl:value-of select="time/end_time"/></td>
      <td><xsl:value-of select="place/building"/></td>
      <td><xsl:value-of select="place/room"/></td>
    </tr>
    </xsl:for-each>
  </table>
  </div>
  <h4 style="text-align:center">Scroll to view all math courses</h4>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>