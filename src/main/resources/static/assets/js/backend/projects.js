define(['jquery', 'bootstrap', 'backend', 'table', 'form'], function ($, undefined, Backend, Table, Form) {

    var Controller = {
        index: function () {
            // 初始化表格参数配置
            Table.api.init({
                extend: {
                    index_url: 'api/projects/getPage',
                    add_url: 'page-edit.html',
                    edit_url: 'page-edit.html',
                    del_url: 'data/del.json',
                    multi_url: 'data/multi.json',
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
                        {field: 'projectId', title: '项目号', operate: '=', sortable: true},
                        {field: 'projectName', title: '项目名', operate: '='},
                        {field: 'groupName', title: '企业系', operate: 'LIKE %...%', placeholder: '关键字，模糊搜索'},
                        {field: 'generalizeName', title: '推广名', operate: false},
                        {field: 'district', title: '区', operate: false},
                        {field: 'projectDType', title: '项目开发类型', operate: false},
                        {field: 'projectRegion', title: '板块', operate: false},
                        {field: 'location', title: '地址', operate: false},
                        {field: 'developer', title: '开发商'},
                        {field: 'openDate', title: '开盘日期'},
                        {field: 'firstOpenDate', title: '第一次开盘日期'},
                        {field: 'lastOpenDate', title: '最近一次开盘'}
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