async function p() {
    const q=await fetch("https://api.chucknorris.io/jokes/random");
    const w=await q.json();
    console.log(w.value);
    document.getElementById("chiste").innerText=w.value;

    
}
