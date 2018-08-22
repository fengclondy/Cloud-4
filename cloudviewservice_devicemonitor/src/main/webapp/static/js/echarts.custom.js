function initVisitorLine(chart){
	//var incount = data.series.incount;
	//var outcount = data.series.outcount;
	//var date = data.date;
	/* var incount = [];
	var outcount = [];
	var addData = function(shift) {
		if(!shift){
			date.push(i);
		}
		incount.push(Math.ceil(Math.random()* 101));
		outcount.push(Math.ceil(Math.random()* 52));
		if (shift) {
			date.shift();
			var val = date[date.length-1] + 1;
			if (val > 24) val = 1;
			date.push(val);
			incount.shift();
			outcount.shift();
		}
	} */
	
	/* for (var i = 1; i <= 24; i++) {
		//addData();
		date.push(i);
	} */

	option = {
		title : {
			text : '各时段进出馆人次',
			x : 'center',
			textStyle : {
				fontSize : 24,
				fontWeight : 'normal',
				color : '#23FFBB'
			}
		},
        tooltip : {
	        showDelay: 0,
	        hideDelay: 0,
	        transitionDuration:0,
	        padding: 15,
	        position : function(p) {
	            return [p[0] + 10, p[1] - 10];
	        },
	        formatter:'{b}<br/>{a}：{c0}'//<br/>{a1}：{c1}<br/>{a2}：{c2}
	    },
        toolbox: {  
            show: true,
            x: 'left',
            feature: {  
                magicType: {show: true, type: ['line', 'bar']},  
                restore: {show: true},  
                saveAsImage: {show: true}  
            }  
        },
        legend: {
	    	show: true,
			x : 'center',
			y : 'bottom',
			itemGap : 20,
			data : [{
				name : '进馆',	
				textStyle : {
					fontSize : 14,
					color : '#99CCCC'
				}
			},{
				name : '出馆',
				textStyle : {
					fontSize : 14,
					color : '#99CCCC'
				}
			}],
			selected: {  
                '进馆': true,  
                '出馆': true
            },
	        itemWidth: 20,             // 图例图形宽度
	        itemHeight: 20            // 图例图形高度
        },
		xAxis : {
			type : 'category',
			axisLine : {
				lineStyle : {
					width: 2,
					color : '#99CCCC'
				}
			},
			axisLabel : {
				formatter : '{value}'
			},
			boundaryGap : false,
			data : []
		},
		yAxis : [ {
			show : true,
			type : 'value',
			axisLine : {
				lineStyle : {
					width: 2,
					color : '#99CCCC'
				}
			},
			splitLine : {
				show : false
			},
			axisLabel : {
				formatter : '{value} 人'
			}
		} ],
		series : [{
			name : '进馆',
			type : 'line',
			barMaxWidth: 25,//最大宽度
			//barWidth : 25,//固定柱子宽度
			symbol : 'none',
			itemStyle : {
				normal : {
					color : '#23FFBB',
					lineStyle: {        // 系列级个性化折线样式
                        width: 2
                  	},
                  	label : {
                        show : true,
                        position : 'top',
                        textStyle : {
                            fontSize : '15'
                        }
                    }
				}
			},
			data : []
		},{
			name : '出馆',
			type : 'line',
			barMaxWidth: 25,//最大宽度
			//barWidth : 25,//固定柱子宽度
			symbol : 'none',
			itemStyle : {
				normal : {
					color : '#FFD54E',
					lineStyle: {        // 系列级个性化折线样式
                        width: 2
                  	},
                  	label : {
                        show : true,
                        position : 'top',
                        textStyle : {
                            fontSize : '15'
                        }
                    }
				}
			},
			data : []
		}]
	};

	chart.setOption(option);
};

function initVisitorBar(chart){
	option = {
		noDataLoadingOption: {
            text: '暂无数据',
            effect: 'bubble',
            effectOption: {
                effect: {
                    n: 0
                }
            }
		},
		title : {
			text : '人流量统计',
			x : 'center',
			textStyle : {
				fontSize : 24,
				fontWeight : 'normal',
				color : '#3784D9'
			}
		},
		tooltip : {
	        trigger: 'axis',
	        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
	            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
	        },
	        textStyle:{
                align:'left'
        	},
	        padding: 15
	    },
	    toolbox: {
	        show : true,
	        showTitle: false,
	        x: 'left',                // 水平安放位置，默认为全图右对齐，可选为：
	        feature : {
	            magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
	            restore : {show: true},
	            saveAsImage : {show: true}
	        }
	    },
	    legend: {
	    	show: true,
			x : 'right',
			y : 'top',
			itemGap : 20,
			data : [{
				name : '进馆',	
				textStyle : {
					fontSize : 14,
					color : '#3784D9'
				}
			},{
				name : '出馆',
				textStyle : {
					fontSize : 14,
					color : '#3784D9'
				}
			}],
			selected: {  
                '进馆': true,  
                '出馆': true
            },
            //backgroundColor: 'rgba(0,0,0,0)',
            //borderWidth: 0,
	        //padding: 2,                // 图例内边距，单位px，默认各方向内边距为5，
	        itemWidth: 20,             // 图例图形宽度
	        itemHeight: 20            // 图例图形高度
        },
        calculable: true,
        grid: {
            y: 80,
            y2: 40,
            x2: 40
        },
        xAxis : {
			axisLine : {
				lineStyle : {
					width: 2,
					color : '#3784D9'
				}
			},
			axisLabel : {
				formatter : '{value}'
			},
			data : []
		},
		yAxis : [ {
			type : 'value',
			axisLine : {
				lineStyle : {
					width: 2,
					color : '#3784D9'//'#99CCCC'
				}
			},
			splitLine : {
				show : false
			},
			axisLabel : {
				formatter : '{value} 人'
			}
		}],
		series : [{
			name: '进馆',
			type : 'bar',
			barMaxWidth: 25,//最大宽度
			//barWidth : 15,//固定柱子宽度
			barGap:'1%',
			stack: '人流量统计',
			itemStyle : {
				normal : {
					color: new echarts.graphic.LinearGradient(0, 0, 0, 1,[{offset: 0, color: '#37CFFC'},{offset: 1, color: '#3784D9'}]),
					label : {
                        show : false,
                        position : 'top',
                        textStyle : {
                            fontSize : '15'
                        }
                    }
				}
			},
			stillShowZeroSum:false,
			data : []
		},{
			name: '出馆',
			type : 'bar',
			barMaxWidth: 25,//最大宽度
			//barWidth : 15,//固定柱子宽度
			barGap:'1%',
			stack: '人流量统计',
			itemStyle : {
				normal : {
					color: new echarts.graphic.LinearGradient(0, 0, 0, 1,[{offset: 0, color: '#FFA500'},{offset: 1, color: '#FF8C00'}]),
					label : {
                        show : false,
						position : 'top',
                        textStyle : {
                            fontSize : '15'
                        }
                    }
				}
			},
			stillShowZeroSum:false,
			data : []
		}]
	};
	// 使用刚指定的配置项和数据显示图表。
	chart.setOption(option);
};


function initLoanBar(chart){
	option = {
		noDataLoadingOption: {
            text: '暂无数据',
            effect: 'bubble',
            effectOption: {
                effect: {
                    n: 0
                }
            }
		},
		title : {
			text : '流通统计',
			x : 'center',
			textStyle : {
				fontSize : 24,
				fontWeight : 'normal',
				color : '#3784D9'
			}
		},
	    tooltip : {
	        trigger: 'axis',
	        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
	            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
	        },
	        textStyle:{
                align:'left'
        	},
	        padding: 15
	    },
	    toolbox: {
	        show : true,
	        showTitle: false,
	        x: 'left',                // 水平安放位置，默认为全图右对齐，可选为：
	        feature : {
	            magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
	            restore : {show: true},
	            saveAsImage : {show: true}
	        }
	    },
	    legend: {
	    	show: true,
			x : 'right',
			y : 'top',
			itemGap : 20,
			data : [{
				name : '借书',	
				textStyle : {
					fontSize : 14,
					color : '#3784D9'
				}
			},{
				name : '还书',
				textStyle : {
					fontSize : 14,
					color : '#3784D9'
				}
			},{
				name : '续借',
				textStyle : {
					fontSize : 14,
					color : '#3784D9'
				}
			}],
			selected: {  
                '借书': true,  
                '还书': true,
                '续借': true
            },
           // backgroundColor: 'rgba(0,0,0,0)',
            //borderWidth: 1,
	       // padding: 2,                // 图例内边距，单位px，默认各方向内边距为5，
	        itemWidth: 20,             // 图例图形宽度
	        itemHeight: 20            // 图例图形高度
        },
        calculable: true,
        grid: {
            y: 80,
            y2: 40,
            x2: 40
        },
        xAxis : {
        	type: 'category',
			axisLine : {
				lineStyle : {
					width: 2,
					color : '#3784D9'
				}
			},
			axisLabel : {
				formatter : '{value}'
			},
			data : []
		},
		yAxis : [ {
			type : 'value',
			axisLine : {
				lineStyle : {
					width: 2,
					color : '#3784D9'//'#99CCCC'
				}
			},
			splitLine : {
				show : false
			},
			axisLabel : {
				formatter : '{value} 本'
			}
		}],
		series : [{
			name: '借书',
			type : 'bar',
			barMaxWidth: 25,//最大宽度
			//barWidth : 25,//固定柱子宽度
			barGap:'1%',
			stack: '流通统计',
			itemStyle : {
				normal : {
					color: new echarts.graphic.LinearGradient(0, 0, 0, 1,[{offset: 0, color: '#37CFFC'},{offset: 1, color: '#3784D9'}]),
					label : {
                        show : false,
                        /*position : 'top',*/
                        textStyle : {
                            fontSize : '13',
                            color:'#27727B'
                        }
                    }
				}
			},
			stillShowZeroSum:false,
			data : []
		},{
			name: '还书',
			type : 'bar',
			barMaxWidth: 25,//最大宽度
			//barWidth : 25,//固定柱子宽度
			barGap:'1%',
			stack: '流通统计',
			itemStyle : {
				normal : {
					color: new echarts.graphic.LinearGradient(0, 0, 0, 1,[{offset: 0, color: '#00FF7F'},{offset: 1, color: '#3CB371'}]),
					label : {
                        show : false,
						/*position : 'top',*/
                        textStyle : {
                            fontSize : '13',
                            color:'#E87C25'
                        }
                    }
				}
			},
			stillShowZeroSum:false,
			data : []
		},{
			name: '续借',
			type : 'bar',
			barMaxWidth: 25,//最大宽度
			//barWidth : 25,//固定柱子宽度
			barGap:'1%',
			stack: '流通统计',
			itemStyle : {
				normal : {
					color: new echarts.graphic.LinearGradient(0, 0, 0, 1,[{offset: 0, color: '#FFA500'},{offset: 1, color: '#FF8C00'}]),
					label : {
                        show : false,
						/*position : 'top',*/
                        textStyle : {
                            fontSize : '13',
                            color:'#00FF7F'
                        }
                    }
				}
			},
			stillShowZeroSum:false,
			data : []
		}]
	};
	// 使用刚指定的配置项和数据显示图表。
	chart.setOption(option);
};

function initFinanceBar(chart){
	/*chart.showLoading({
	    text : '正在加载...',
	    textStyle : {
	        fontSize : 20
	    }
	});*/
	option = {
		noDataLoadingOption: {
            text: '暂无数据',
            effect: 'bubble',
            effectOption: {
                effect: {
                    n: 0
                }
            }
		},
		title : {
			text : '当日财经',
			x : 'center',
			textStyle : {
				fontSize : 24,
				fontWeight : 'normal',
				color : '#3784D9'
			}
		},
		tooltip : {
	        trigger: 'axis',
	        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
	            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
	        },
	        textStyle:{
                align:'left'
        	},
	        padding: 15
	    },
	    toolbox: {
	        show : true,
	        showTitle: false,
	        x: 'left',                // 水平安放位置，默认为全图右对齐，可选为：
	        feature : {
	            magicType : {show: true, type: ['line', 'bar']},//, 'stack', 'tiled'
	            restore : {show: true},
	            saveAsImage : {show: true}
	        }
	    },
	    legend: {
	    	show: true,
			x : 'right',
			y : 'top',
			itemGap : 20,
			data : [{
				name : '收款',	
				textStyle : {
					fontSize : 14,
					color : '#3784D9'
				}
			}],
			selected: {  
                '收款': true
            },
           // backgroundColor: 'rgba(0,0,0,0)',
            //borderWidth: 1,
	       // padding: 2,                // 图例内边距，单位px，默认各方向内边距为5，
	        itemWidth: 20,             // 图例图形宽度
	        itemHeight: 20            // 图例图形高度
        },
	    calculable: true,
        grid: {
            y: 80,
            y2: 40,
            x2: 40
        },
        xAxis : {
			axisLine : {
				lineStyle : {
					width: 2,
					color : '#3784D9'
				}
			},
			axisLabel : {
				formatter : '{value}'
			},
			data : []
		},
		yAxis : [ {
			type : 'value',
			axisLine : {
				lineStyle : {
					width: 2,
					color : '#3784D9'//'#99CCCC'
				}
			},
			splitLine : {
				show : false
			},
			axisLabel : {
				formatter : '{value} 元'
			}
		}],
		series : [{
			name: '收款',
			type : 'bar',
			//barWidth : 25,//固定柱子宽度
			barMaxWidth: 25,//最大宽度
			barGap:'1%',
			itemStyle : {
				normal : {
					color: new echarts.graphic.LinearGradient(0, 0, 0, 1,[{offset: 0, color: '#37CFFC'},{offset: 1, color: '#3784D9'}]),
					label : {
                        show : false,
                        position : 'top',
                        textStyle : {
                            fontSize : '12',
                            color:'#3784D9'
                        }
                    }
				}
			},
			stillShowZeroSum:false,
			data : []
		}]
	};
	// 使用刚指定的配置项和数据显示图表。
	chart.setOption(option);
};

function initCardissueBar(chart){
	/*chart.showLoading({
	    text : '正在加载...',
	    textStyle : {
	        fontSize : 20
	    }
	});*/
	option = {
		noDataLoadingOption: {
            text: '暂无数据',
            effect: 'bubble',
            effectOption: {
                effect: {
                    n: 0
                }
            }
		},
		title : {
			text : '当日办证量',
			x : 'center',
			textStyle : {
				fontSize : 24,
				fontWeight : 'normal',
				color : '#3784D9'
			}
		},
		tooltip : {
	        trigger: 'axis',
	        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
	            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
	        },
	        textStyle:{
                align:'left'
        	},
	        padding: 15
	    },
	    toolbox: {
	        show : true,
	        showTitle: false,
	        x: 'left',                // 水平安放位置，默认为全图右对齐，可选为：
	        feature : {
	            magicType : {show: true, type: ['line', 'bar']},//, 'stack', 'tiled'
	            restore : {show: true},
	            saveAsImage : {show: true}
	        }
	    },
	    legend: {
	    	show: true,
			x : 'right',
			y : 'top',
			itemGap : 20,
			data : [{
				name : '办证',	
				textStyle : {
					fontSize : 14,
					color : '#3784D9'
				}
			}],
			selected: {  
                '办证': true
            },
           // backgroundColor: 'rgba(0,0,0,0)',
            //borderWidth: 1,
	       // padding: 2,                // 图例内边距，单位px，默认各方向内边距为5，
	        itemWidth: 20,             // 图例图形宽度
	        itemHeight: 20            // 图例图形高度
        },
	    calculable: true,
        grid: {
            y: 80,
            y2: 40,
            x2: 40
        },
        xAxis : {
			axisLine : {
				lineStyle : {
					width: 2,
					color : '#3784D9'
				}
			},
			axisLabel : {
				formatter : '{value}'
			},
			data : []
		},
		yAxis : [ {
			type : 'value',
			axisLine : {
				lineStyle : {
					width: 2,
					color : '#3784D9'//'#99CCCC'
				}
			},
			splitLine : {
				show : false
			},
			axisLabel : {
				formatter : '{value} 张'
			}
		}],
		series : [{
			name: '办证',
			type : 'bar',
			//barWidth : 25,//固定柱子宽度
			barMaxWidth: 25,//最大宽度
			barGap:'1%',
			itemStyle : {
				normal : {
					color: new echarts.graphic.LinearGradient(0, 0, 0, 1,[{offset: 0, color: '#37CFFC'},{offset: 1, color: '#3784D9'}]),
					label : {
                        show : false,
                        position : 'top',
                        textStyle : {
                            fontSize : '12',
                            color:'#3784D9'
                        }
                    }
				}
			},
			stillShowZeroSum:false,
			data : []
		}]
	};
	// 使用刚指定的配置项和数据显示图表。
	chart.setOption(option);
};

function initPie(chart,title,legend,series){
	option = {
	    title : {
	        text: title,
	        x:'center',
	        textStyle : {
				fontSize : 24,
				fontWeight : 'normal',
				color : '#3784D9'
			}
	    },
	    tooltip : {
	        trigger: 'item',
	        formatter: "{a} <br/>{b} : {c} ({d}%)"
	    },
	    legend: {
	        orient : 'vertical',
	        x : 'left',
	        y : 'center',
	        data:legend
	    },
	    toolbox: {
	        show : true,
	        feature : {
	            mark : {show: true},
	            dataView : {show: true, readOnly: false},
	            magicType : {
	                show: true, 
	                type: ['pie', 'funnel'],
	                option: {
	                    funnel: {
	                        x: '25%',
	                        width: '50%',
	                        funnelAlign: 'left',
	                        max: 1548
	                    }
	                }
	            },
	            restore : {show: true},
	            saveAsImage : {show: true}
	        }
	    },
	    calculable : true,
	    series : [
	        {
	            type:'pie',
	            radius : '55%',
	            center: ['50%', '60%'],
	            data:series
	        }
	    ],
	    color:['#37CFFC','#FFA500','#3784D9','#607B8B','#FF83FA']
	};
	chart.setOption(option);
};

function formatter(num) {  
    var num = (num || 0).toString(), result = '';  
    while (num.length > 3) {  
        result = ',' + num.slice(-3) + result;  
        num = num.slice(0, num.length - 3);  
    }  
    if (num) { result = num + result; }  
    return result;  
}