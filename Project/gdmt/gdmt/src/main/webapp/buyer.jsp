<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>买方挂牌信息</title>
</head>
<body>
<html:form>

	<table width="1000" height="436" border="0" cellpadding="0" cellspacing="0" background="images/center2.jpg">
        <tr>
          <td height="436" valign="top" align="center">

		  <table border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D">
            <tr>
              <th width="90" height="25">申请单位：</th>
              <td width="200" bgcolor="#FFFFFF"><html:text property="em_serialNumber" value="${requestScope.autoNumber}" readonly="readonly" onclick="alert('此文本框已设为只读，用户不能修改')"/></td>
              <th width="90">单据编号：</th>
              <td width="200" bgcolor="#FFFFFF"><html:text property="em_name" title="请输入单据编号"/></td>
              <th width="90">申请人：</th>
              <td width="200" bgcolor="#FFFFFF"><html:text property="em_name" title="请输入申请人姓名"/></td>
            </tr>
            <tr>
              <th height="25">签发人：</th>
              <td bgcolor="#FFFFFF"><html:text property="em_age" title="请输入签发人姓名"/></td>
              <th>申请日期：</th>
              <td bgcolor="#FFFFFF"><html:text property="em_age" title="请输入申请日期"/></td>
              <th>交货时间：</th>
              <td bgcolor="#FFFFFF"><html:text property="em_age" title="请输入交货时间"/></td>
            </tr>
            <tr>
              <th height="25">煤种：</th>
               <select name="selectList">
         			<option>烟煤</option>
         			<option>褐煤</option>
         			<option>无烟煤</option>
     		 </select>
              <td bgcolor="#FFFFFF"><html:text property="em_born" title="è¯·è¾å¥åå·¥åºçæ¥æ"/></td>
              <th>èº«ä»½è¯å·ï¼</th>
              <td bgcolor="#FFFFFF"><html:text property="em_IDCard" title="è¯·è¾å¥åå·¥èº«ä»½è¯å·ç "/></td>
            </tr>
            <tr>
              <th height="25">æ°æï¼</th>
              <td bgcolor="#FFFFFF"><html:text property="em_nation" title="è¯·è¾å¥è¯¥åå·¥çæ°æ"/></td>
              <th>å©å§»ç¶åµï¼</th>
              <td bgcolor="#FFFFFF"><html:radio property="em_marriage" value="æªå©" styleClass="input1"/>&nbsp;æªå©&nbsp; &nbsp; &nbsp; <html:radio property="em_marriage" value="å·²å©" styleClass="input1"/>&nbsp;å·²å©</td>
            </tr>
            <tr>
              <th height="25">æ¿æ²»é¢è²ï¼</th>
              <td bgcolor="#FFFFFF"><html:radio property="em_visage" value="åå" styleClass="input1"/>&nbsp;åå&nbsp; &nbsp; <html:radio property="em_visage" value="å¢å" styleClass="input1"/>&nbsp;å¢å&nbsp;  &nbsp; <html:radio property="em_visage" value="æ " styleClass="input1"/>&nbsp;æ </td>
              <th>ç±è´¯ï¼</th>
              <td bgcolor="#FFFFFF"><html:text property="em_ancestralHome" title="è¯·è¾å¥ç±è´¯"/></td>
            </tr>
            <tr>
              <th height="25">èç³»çµè¯ï¼</th>
              <td bgcolor="#FFFFFF"><html:text property="em_tel" title="è¯·è¾å¥èç³»çµè¯"/></td>
              <th>å®¶åº­ä½åï¼</th>
              <td bgcolor="#FFFFFF"><html:text property="em_address" title="è¯·è¾å¥å®¶åº­ä½å"/></td>
            </tr>
            <tr>
              <th height="25">æ¯ä¸å­¦æ ¡ï¼</th>
              <td bgcolor="#FFFFFF"><html:text property="em_afterschool" title="è¯·è¾å¥æ¯ä¸å­¦æ ¡"/></td>
              <th>ä¸ä¸ï¼</th>
              <td bgcolor="#FFFFFF"><html:text property="em_speciality" title="è¯·è¾å¥ä¸ä¸åç§°"/></td>
            </tr>
            <tr>
              <th height="25">æåç¨åº¦ï¼</th>
              <td bgcolor="#FFFFFF">
                <html:select property="em_culture">
                     <html:option value="ç ç©¶ç">ç ç©¶ç</html:option>
                     <html:option value="æ¬ç§ç">æ¬ç§ç</html:option>
                     <html:option value="å¤§ä¸ç">å¤§ä¸ç</html:option>
                </html:select>
              </td>
              <th>ä¸å²æ¶é´ï¼</th>
              <td bgcolor="#FFFFFF"><html:text property="em_startime" title="è¯·è¾å¥ä¸å²æ¶é´"/></td>
            </tr>
            <tr>
              <th height="25">é¨é¨åç§°ï¼</th>
              <td bgcolor="#FFFFFF">
                <html:select property="em_departmentId">

                <html:option value=></html:option>
                
                </html:select>              </td>
              <th>é¨é¨å·¥ç§ï¼</th>
              <td bgcolor="#FFFFFF">
                <html:select property="em_typework">
                   <html:option value="ç¨åºå">ç¨åºå</html:option>
                   <html:option value="ææ¡£äººå">ææ¡£äººå</html:option>
                   <html:option value="é¨é¨ç»ç">é¨é¨ç»ç</html:option>
                </html:select>
              </td>
            </tr>
            <tr>
              <th height="25">ç»è®°äººåï¼</th>
              <td bgcolor="#FFFFFF"><text property="em_createName" value="${sessionScope.managerform.account}" readonly="readonly" onclick="alert('æ­¤ææ¬æ¡å·²è®¾ä¸ºåªè¯»ï¼ç¨æ·ä¸è½ä¿®æ¹')"/></td>
              <th>ç»è®°æ¶é´ï¼</th>                                                              
              <td bgcolor="#FFFFFF"><text property="em_creatime"  readonly="readonly" onclick="alert('æ­¤ææ¬æ¡å·²è®¾ä¸ºåªè¯»ï¼ç¨æ·ä¸è½ä¿®æ¹')"/></td>
            </tr>
			<tr>
              <th height="107">å¤æ³¨ä¿¡æ¯ï¼</th>
              <td colspan="3" bgcolor="#FFFFFF"><html:textarea property="em_bz" title="è¯·è¾å¥å¤æ³¨ä¿¡æ¯" styleClass="textarea" rows="7" cols="75"/></td>
              </tr>
          </table>
  
     </html:form>
     
          </td>
        </tr>
      </table>
</body>
</html>
