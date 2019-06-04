
  function success(latitude,longitude){
            debugger;
            alert("lat" + latitude+"Long"+longitude);
        };
        setTimeout( function(){
            debugger;
            Cordova.exec(success, null, "GeoLocation", "getLoc");
           
        }, 10000); 

