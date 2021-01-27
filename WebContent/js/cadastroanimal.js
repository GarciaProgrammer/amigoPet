
let name = document.querySelector("#nome");

form.addEventListener("submit", function(event) {
	event.preventDefault();
	
	let dados = {
		name: name.value
	};
	
	console.log(dados)
})