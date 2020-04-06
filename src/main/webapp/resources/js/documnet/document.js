//nego 등록화면 이동 버튼
$("#btn_w_nego_ins").click(function(){			
				javascript:location.href="/nego/ins.do";				
			});
//nego 상세 화면 이동
$("#w-nego-list tr").click(function(){		
	var q_num = $(this).attr('C_NUM');
	javascript:location.href = "/nego/dtl.do?c="+c_num;	
});
