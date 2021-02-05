var app = (function(){

       var numeros = function (error,info){
                  if(error != null){
                        alert("Los datos ingresados son invalidos");
                        return;
                  }
                  $("#avg").text(info.media);
                  $("#stdv").text(info.desviacion);
       }
       var enviar = function(){
                var strings = $("#captura").val();
                var listaNumeros = strings.split(",");
                apiclient.leerDatos(listaNumeros, numeros);
       }
    return{
                leerDatos : function(){
                       enviar();
                }
    }
})();