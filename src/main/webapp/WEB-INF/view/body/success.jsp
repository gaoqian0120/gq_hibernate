<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/25
  Time: 15:07:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html >
<head>
    <%--<meta charset="UTF-8">
    <title>layui table</title>
    <link rel="stylesheet" href="layui/css/layui.css" media="all">
    <script src="/js/jquery-3.6.0/jquery-3.6.0.min.js"></script>
    <script src="layui/layui.js"></script>--%>

    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="E:/layui/layui/css/layui.css" media="all">


    <style>
        html, body {
            background-color: #F1F1F1;
            margin: 0;
            padding: 0;
        }
    </style>
</head>
<%--
<body>
当前时间
<H3>${date}</H3>
12121212121

<form id="form1" runat="server">
    <div>
        <table id="demo" lay-filter="test"></table>
    </div>
</form>

<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card layui-form">
                <div class="layui-card-header">查询条件</div>
                <div class="layui-card-body layui-row layui-col-space15">
                    <div class="layui-col-md2">
                        <input type="text" class="layui-input" id="deviceNumber" placeholder="设备名称" />
                    </div>
                    <div class="layui-col-md2">
                        <select name="" lay-verify="required" lay-search id="">
                            <option value="">设备型号</option>
                            <option value="">名称列表</option>
                        </select>
                    </div>
                    <div class="layui-col-md12">
                        <button class="layui-btn" data-type="reload">查询</button>
                        <div class="layui-btn-group demoTable">
                            <button class="layui-btn" data-type="getCheckData">获取选中行数据</button>
                            <button class="layui-btn" data-type="getCheckLength">获取选中数目</button>
                            <button class="layui-btn" data-type="isAll">验证是否全选</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="layui-col-md12">
            <div class="layui-card layui-form">
                <div class="layui-card-header">查询结果</div>
                <div class="layui-card-body">
                    <table class="layui-hide" id="layListId" lay-filter="layList"></table>

                    <script type="text/html" id="barDemo">
                        <button type="button" class="layui-btn layui-btn-sm layui-btn-warm" lay-event="maintainRecord">保养记录</button>
                        <button type="button" class="layui-btn layui-btn-sm layui-btn-warm" lay-event="repairRecord">维修记录</button>

                    </script>
                </div>
            </div>
        </div>
    </div>

</div>
&lt;%&ndash;
<script>
    layui.use('table', function() {
        var table = layui.table;
        table.render({
            elem: '#layListId',
            id: 'layTableId',
            url: 'json/table.json',
            title: '维修保养报',
            cellMinWidth: 100,
            cols: [
                [{
                    type: 'checkbox',
                    fixed: 'left'
                }, {
                    type: 'numbers',
                    fixed: 'left'
                }, {
                    field: 'deviceNumber',
                    title: '设备编号',
                    minWidth: '120'
                }, {
                    field: 'deviceName',
                    title: '设备名称',
                    minWidth: '120'
                }, {
                    field: 'deviceType',
                    title: '设备型号'
                }, {
                    title: '操作',
                    minWidth: '180',
                    align: 'center',
                    toolbar: '#barDemo'
                }]
            ],
            page: true
        });
        //监听工具条
        table.on('tool(layList)', function(obj) {
            var data = obj.data; //获得当前行数据
            switch(obj.event) {
                case 'maintainRecord':
                    maintainRecord();
                    break;
                case 'repairRecord':
                    repairRecord();
                    break;
                default:
                    break;
            }

        });
        var $ = layui.$,
            active = {
                reload: function() {
                    var deviceNumber = $("#deviceNumber").val();

                    //执行重载
                    table.reload('layTableId', {
                        page: {
                            curr: 1
                        },
                        where: {
                            deviceNumber: deviceNumber
                        }
                    });
                },
                getCheckData: function() { //获取选中数据
                    var checkStatus = table.checkStatus('layTableId'),
                        data = checkStatus.data;
                    layer.alert(JSON.stringify(data));
                },
                getCheckLength: function() { //获取选中数目
                    var checkStatus = table.checkStatus('layTableId'),
                        data = checkStatus.data;
                    layer.msg('选中了：' + data.length + ' 个');
                },
                isAll: function() { //验证是否全选
                    var checkStatus = table.checkStatus('layTableId');
                    layer.msg(checkStatus.isAll ? '全选' : '未全选')
                }

            };
        $('.layui-btn').on('click', function() {
            var type = $(this).data('type');
            active[type] && active[type].call(this);
        });

        function maintainRecord() {
            layer.msg("保养记录");
        };

        function repairRecord() {
            layer.msg("维修记录");

        };
    });
</script>
&ndash;%&gt;
</body>
--%>


<body>
<div style="margin-bottom: 5px;">

</div>
<table class="layui-table" lay-data="{width: 892, height:332, url:, page:true, id:'idTest'}" lay-filter="demo">
    <thead>
    <tr>
        <th lay-data="{field:'id', width:80, sort: true, fixed: true}">ID</th>
        <th lay-data="{field:'username', width:80}">用户名</th>
        <th lay-data="{field:'sex', width:80, sort: true}">性别</th>
        <th lay-data="{field:'city', width:80}">城市</th>
        <th lay-data="{field:'sign', width:160}">签名</th>
        <th lay-data="{field:'experience', width:80, sort: true}">积分</th>

        <th lay-data="{field:'classify', width:80}">职业</th>
        <th lay-data="{field:'wealth', width:135, sort: true}">财富</th>
        <th lay-data="{field:'score', width:80, sort: true, fixed: 'right'}">评分</th>
        <th lay-data="{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}"></th>
    </tr>
    </thead>
</table>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>


<script src="E:/layui/layui/layui.js"   charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use('table', function(){
        var table = layui.table;
        //监听表格复选框选择
        table.on('checkbox(demo)', function(obj){
            console.log(obj)
        });
        //监听工具条
        table.on('tool(demo)', function(obj){
            var data = obj.data;
            if(obj.event === 'detail'){
                layer.msg('ID：'+ data.id + ' 的查看操作');
            } else if(obj.event === 'del'){
                layer.confirm('真的删除行么', function(index){
                    obj.del();
                    layer.close(index);
                });
            } else if(obj.event === 'edit'){
                layer.alert('编辑行：<br>'+ JSON.stringify(data))
            }
        });

        var $ = layui.$, active = {
            getCheckData: function(){ //获取选中数据
                var checkStatus = table.checkStatus('idTest')
                    ,data = checkStatus.data;
                layer.alert(JSON.stringify(data));
            }
            ,getCheckLength: function(){ //获取选中数目
                var checkStatus = table.checkStatus('idTest')
                    ,data = checkStatus.data;
                layer.msg('选中了：'+ data.length + ' 个');
            }
            ,isAll: function(){ //验证是否全选
                var checkStatus = table.checkStatus('idTest');
                layer.msg(checkStatus.isAll ? '全选': '未全选')
            }
        };

        $('.demoTable .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });
</script>

</body>

</html>
