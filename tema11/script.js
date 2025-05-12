let schimbareCulori;

function porneste() {
    schimbareCulori = setInterval(() => {
        let zona1 = document.getElementById("zona1");
        let zona2 = document.getElementById("zona2");

        if (zona1.style.backgroundColor === "red") {
            zona1.style.backgroundColor = "blue";
            zona2.style.backgroundColor = "red";
        } else {
            zona1.style.backgroundColor = "red";
            zona2.style.backgroundColor = "blue";
        }
    }, 1000);
}

function opreste() {
    clearInterval(schimbareCulori);
}
