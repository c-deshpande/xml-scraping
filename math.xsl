<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="*">
        <html>
            <body>
                <table border="1">
                    <tr>
                        <th>Registration Number</th>
                        <th>Subject</th>
                        <th>Course</th>
                        <th>Section</th>
                        <th>Title</th>
                        <th>Units</th>
                        <th>Instructor</th>
                        <th>Days</th>
                        <th>Start Time</th>
                        <th>End Time</th>
                        <th>Building</th>
                        <th>Room</th>
                    </tr>
                    <xsl:for-each select="course">
                        <xsl:if test="subj='MATH'">
                            <tr>
                                <td><xsl:value-of select="reg_num"/></td>
                                <td><xsl:value-of select="subj"/></td>
                                <td><xsl:value-of select="crse"/></td>
                                <td><xsl:value-of select="sect"/></td>
                                <td><xsl:value-of select="title"/></td>
                                <td><xsl:value-of select="units"/></td>
                                <td><xsl:value-of select="instructor"/></td>
                                <td><xsl:value-of select="days"/></td>
                                <td><xsl:value-of select="time/start_time"/></td>
                                <td><xsl:value-of select="time/end_time"/></td>
                                <td><xsl:value-of select="place/building"/></td>
                                <td><xsl:value-of select="place/room"/></td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
