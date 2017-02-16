<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh_CN">
<head>
    <meta charset="UTF-8">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">
    <h4>输入框</h4>
    <input type="text" placeholder="输入框默认值">

    <hr>
    <h4>文本框</h4>
    <textarea rows="3"></textarea>

    <hr>
    <h4>复选框</h4>
    <label class="checkbox inline">
        <input type="checkbox" value="1"/> 复选框1
    </label>
    <label class="checkbox inline">
        <input type="checkbox" value="2"/> 复选框2
    </label>
    <label class="checkbox inline">
        <input type="checkbox" value="3"/> 复选框3
    </label>

    <hr>
    <h4>单选框</h4>
    <label class="radio inline">
        <input type="radio" name="option1" id="option1" value="1" checked>单选框1
    </label>
    <label class="radio inline">
        <input type="radio" name="option1" id="option2" value="2" >单选框2
    </label>

    <hr>
    <label>
        <h4>下拉框</h4>
          选择城市：
        <select name="city" size="3">
            <optgroup label="安徽">
                <option value="合肥" selected="selected">合肥</option>
                <option value="黄山">黄山</option>
            </optgroup>
            <optgroup label="江苏">
                <option value="南京">南京</option>
                <option value="无锡">无锡</option>
            </optgroup>
        </select>
    </label>
</div>
<script src="../js/jquery.js"></script>
<script src="../js/bootstrap.js"></script>
</body>
</html>