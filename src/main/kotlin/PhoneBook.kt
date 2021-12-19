import java.util.*

class PhoneBook()  {

    private var contArr = arrayOfNulls<Contact>(8)
    private var elemNum = 0

    fun addContact(contact: Contact) {
        contArr[elemNum % 8] = contact
        elemNum++
    }

    fun showContacts() {
        val i = contArr.size
        var j = 0
        var contact : Contact
        while (j < i && contArr[j] != null){
            contact = contArr[j]!!
            println("$j ${contact.fName} ${contact.secName} ${contact.nickName}")
            j++
        }
    }


    fun searchContact(scan : Scanner) {
        val id : Int
        showContacts()
        print("Select a nessesary id, please: ")
        try {
            id = scan.nextInt()
            if (id < 0 || id >= contArr.size)
                throw Exception("ooops!")
        } catch (e : Exception)
        {
            println("Ooops! invalid index! search again!")
            return
        }
        printContactData(id)
    }


    fun generateContact(scan : Scanner) {
        print("Enter the first name: ")
        val name = scan.next()
        print("Enter the second name: ")
        val secName = scan.next()
        print("Enter the nickname: ")
        val nickName = scan.next()
        print("Enter the phone number: ")
        val phone : Int
        try {
            phone = scan.nextInt()
        } catch (e : Exception) {
            println("Ooooops! invalid phoneNumber!")
            println("Contact creation was stopped!")
            return
        }
        print("shhhhhh ... Enter the ... darkest secret! ")
        val secret = scan.next()
        println("A new contact was created!")
        addContact(Contact(name, secName, nickName, phone, secret))
    }

    fun printContactData(id : Int) {
        val curCont = contArr[id]
        if (curCont != null) {
            println("""name = ${curCont.fName} 
               |second name = ${curCont.secName}
               |nick name = ${curCont.nickName}
               |phone number = ${curCont.pNum}
               |shhhhhh!
               |darkest secret is = ${curCont.dSecret}
            """.trimMargin())
        } else {
            println("Invalid index! Try again!")
        }
    }
}