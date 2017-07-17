$(function () {
    $('form').bootstrapValidator({
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
        	empno:{
        		validators:{
        			notEmpty:{
        				message: '员工编号不能为空'
        			},
        			regexp:{
        				regexp: /^33\d{3}$/,
        				message: '请输入正确格式：33XXX'
        			}
        		}
        	},
        	
        	ename:{
        		validators:{
        			notEmpty:{
        				message: '姓名不能为空'
        			},
        			regexp:{
        				regexp: /[\u4E00-\u9FA5]{2,5}(?:·[\u4E00-\u9FA5]{2,5})*/,
        				message: '请输入正确姓名'
        			}
        		}
        	},
        	
        	bornDate:{
        		validators:{
        			notEmpty:{
        				message: '出生日期不能为空'
        			}
        		}
        	},
        	
        	identityId:{
        		validators:{
        			notEmpty:{
        				message: '身份证号不能为空'
        			},
        			regexp:{
        				regexp: /^(\d{6})(\d{4})(\d{2})(\d{2})(\d{3})([0-9]|X)$/,
        				message: '请输入正确身份证号'
        			}
        		}
        	},
        	
        	entryDate:{
        		validators:{
        			notEmpty:{
        				message: '入职日期不能为空'
        			}
        		}
        	},
        	
        	workDate:{
        		validators:{
        			notEmpty:{
        				message: '参加工作日期不能为空'
        			}
        		}
        	},
        	
        	enation:{
        		validators:{
        			notEmpty:{
        				message: '民族不能为空'
        			}
        		}
        	},
        	
        	enative:{
        		validators:{
        			notEmpty:{
        				message: '籍贯不能为空'
        			}
        		}
        	},
        	
        	etel:{
        		validators:{
        			notEmpty:{
        				message: '联系电话不能为空'
        			},
        			regexp:{
        				regexp: /(^(0[0-9]{2,3}\-)?([2-9][0-9]{6,7})+(\-[0-9]{1,4})?$)|(^0?[1][358][0-9]{9}$)/,
        				message: '请输入正确联系电话'
        			}
        		}
        	},
        	
        	email: {
                validators: {
                    notEmpty: {
                        message: '邮箱地址不能为空'
                    },
		            emailAddress: {
		                message: '邮箱地址格式有误'
		            }
                }
            },
            
            bloodType:{
        		validators:{
        			notEmpty:{
        				message: '血型不能为空'
        			}
        		}
        	},
        	
        	hometown:{
        		validators:{
        			notEmpty:{
        				message: '出生地不能为空'
        			}
        		}
        	},
        	
        	graduatedSchool:{
        		validators:{
        			notEmpty:{
        				message: '毕业院校 不能为空'
        			}
        		}
        	},
        	
        	emajor:{
        		validators:{
        			notEmpty:{
        				message: '所学专业 不能为空'
        			}
        		}
        	},
        	
        	graduatedDate:{
        		validators:{
        			notEmpty:{
        				message: '毕业日期 不能为空'
        			}
        		}
        	}           	
        }
    });
});