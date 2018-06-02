define(['jquery', 'bootstrap', 'backend', 'table', 'form'], function ($, undefined, Backend, Table, Form) {

    var Controller = {
        index: function () {
            // 初始化表格参数配置
            Table.api.init({
                extend: {
                    index_url: '/api/trans/getPage',
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
                        {field: 'district', title: '区域', operate: '=', sortable: true},
                        {field: 'projectRegion', title: '板块', style: 'width:200px;', operate: false},
                        {field: 'projectRegiont', title: '微板块'},
                        {field: 'buildingName', title: '幢号',  operate: false},
                        {field: 'roomName', title: '房号',  operate: false},
                        {field: 'roomBuildArea', title: '面积', operate: false},
                        {field: 'roomType', title: '户型', operate: false},
                        {field: 'roomTopFloor', title: '总层数', operate: false},
                        {field: 'roomUsage', title: '用途', operate: false},
                        {field: 'roomStatus', title: '房源状态', operate: false},
                        {field: 'roomRefPrice', title: '申报均价', operate: false},
                        {field: 'transAvgPrice', title: '交易均价', operate: false},
                        {field: 'transTotalPrice', title: '交易总价', operate: false},
                        {field: 'transDate', title: '交易日期', operate: false},
                        {field: 'transType', title: '交易类型', operate: false},
                        {field: 'transFromTo', title: '交易类型', operate: false},
                        {field: 'roomFloor', title: '所在层数', operate: false},
                        {field: 'roomTopFloor', title: '最高层', operate: false},
                        {field: 'roomReLocation', title: '房源状态', operate: false}
                        // {field: 'weigh', title: __('Weigh'), operate: false},
                        // {field: 'status', title: __('Status'), formatter: Table.api.formatter.status, searchList: {'normal': __('Normal'), 'hidden': __('Hidden')}, style: 'min-width:100px;'},
                        // {field: 'createtime', title: __('Create Time'), formatter: Table.api.formatter.datetime, operate: 'BETWEEN', type: 'datetime', addclass: 'datetimepicker', data: 'data-date-format="YYYY-MM-DD"'},
                        // {field: 'operate', title: __('Operate'), events: Table.api.events.operate, formatter: Table.api.formatter.operate}
                    ]
                ]
                // ,
                // //普通搜索
                // commonSearch: true,
                // titleForm: '', //为空则不显示标题，不定义默认显示：普通搜索
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