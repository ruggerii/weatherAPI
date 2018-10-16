$(function(){

    $('#search').click(function(){
        $('#container').load('temp.html', function(){
            $.get('http://localhost:8080?q='+$('#cidade').val(), function(data){
                var dia = new Date(data[0].data).getDay();
                if(dia == 1)dia = 'Domingo'; 
                else if(dia == 2) dia = 'Segunda-Feira';
                else if(dia == 3) dia = 'Terça-Feira';
                else if(dia == 4) dia = 'Quarta-Feira';
                else if(dia == 5) dia = 'Quinta-Feira';
                else if(dia == 6) dia = 'Sexta-Feira';
                else dia = 'Sabado';
                $('.date').html(dia+' '+ new Date().getDate() +'/' +new Date().getMonth() +'/'+ new Date().getFullYear());
                $('#tmp_max').html(data[0].temperatura_max + "°C");    
                $('#tmp_min').html(data[0].temperatura_min + "°C");    
                var div = $('#corpo_temp');
                        $(data).each(function(obj){
                        });
                    });
                });
            });
});