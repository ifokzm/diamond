define(['jquery', 'bootstrap', 'backend', 'table', 'form'], function ($, undefined, Backend, Table, Form) {

    var Controller = {
        index: function () {
            // 初始化表格参数配置
            Table.api.init({
                extend: {
                    index_url: '/api/user/getPage',
                    // add_url: 'page-edit.html',
                    // edit_url: 'page-edit.html',
                    // del_url: 'data/del.json',
                    // multi_url: 'data/multi.json',
                    table: 'page',
                }
            });

            var table = $("#table");

            // 初始化表格
            table.bootstrapTable({
                url: $.fn.bootstrapTable.defaults.extend.index_url,
                sortName: 'weigh',
                columns: [
                    [
                        {field: 'state', checkbox: true},
                        {field: 'id', title: __('Id'), operate: false},
                        {field: 'groupName', title: '公司', operate: 'LIKE %...%', placeholder: '公司'},
                        {field: 'userName', title: '用户名'},
                        {field: 'loginName', title: '登录名'},
                        {field: 'password', title: '密码' },
                        {field: 'beginTime', title: '开通时间' },
                        {field: 'endTime', title: '结束时间' },
                        {field: 'operate', title: __('Operate'), events: Table.api.events.operate, formatter: Table.api.formatter.operate}

                    ]
                ],
                //普通搜索
                commonSearch: true,
                titleForm: '', //为空则不显示标题，不定义默认显示：普通搜索
            });

            // 为表格绑定事件
            Table.api.bindevent(table);
        },
        add: function () {
            Controller.api.bindevent();
        },
        edit: function () {
            Controller.api.bindevent();
        },
        api: {
            bindevent: function () {
                Form.api.bindevent($("form[role=form]"));
            }
        }
    };
    return Controller;
});