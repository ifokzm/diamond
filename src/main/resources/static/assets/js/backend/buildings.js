define(['jquery', 'bootstrap', 'backend', 'table', 'form'], function ($, undefined, Backend, Table, Form) {

    var Controller = {
        index: function () {
            // 初始化表格参数配置
            Table.api.init({
                extend: {
                    index_url: '/api/buildings/getPage',
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
                        {field: 'id', title: __('Id'), operate: false},
                        {field: 'projectId', title: '项目编号', operate: '=', sortable: true},
                        {field: 'projectName', title: '项目名称', operate: '='},
                        {field: 'buildingId', title: '幢号', operate: 'LIKE %...%', placeholder: '关键字，模糊搜索'},
                        {field: 'buildingName', title: '幢名称',  operate: false},
                        {field: 'groupName', title: '企业系', formatter: Table.api.formatter.image, operate: false},
                        {field: 'openDate', title: '开盘日期', operate: false},
                        {field: 'roomTopFloor', title: '总层数', operate: false}
                        // {field: 'weigh', title: __('Weigh'), operate: false},
                        // {field: 'status', title: __('Status'), formatter: Table.api.formatter.status, searchList: {'normal': __('Normal'), 'hidden': __('Hidden')}, style: 'min-width:100px;'},
                        // {field: 'createtime', title: __('Create Time'), formatter: Table.api.formatter.datetime, operate: 'BETWEEN', type: 'datetime', addclass: 'datetimepicker', data: 'data-date-format="YYYY-MM-DD"'},
                        // {field: 'operate', title: __('Operate'), events: Table.api.events.operate, formatter: Table.api.formatter.operate}
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