Confirm = {
    show: function (message, callback) {
        Swal.fire({
            title: 'Do you want to delete this record？',
            text: message,
            icon: 'warning',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: 'Yes!'
        }).then((result) => {
            if (result.value) {
                if (callback) {
                    callback()
                }
            }
        })
    }
}