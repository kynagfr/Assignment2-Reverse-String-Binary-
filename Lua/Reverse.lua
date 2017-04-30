open = io.open

function read_file(path)
	file = open(path, "rb") -- r read mode and b binary mode
	if not file then return nil end
	content = file:read "*a" -- *a or *all reads the whole file
	file:close()
	return content
end

fContent = read_file("TextInput.txt")


function StringToBinary(data)
 file:write("string len = " ..#str ..'\n')
  math.randomseed(os.time())
  for i=1, #str do
    t[i] =  string.byte(str,i)
  end  
end

function toBinAndBack(s)
  local bin = toBin(s)
  local r = {}
  for i=1,#bin,8 do
    local n = 0
    for j=0,7 do
      n = n + (2^(7-j)) * bin[i+j]
    end
    r[#r+1] = n
  end
  for i=1,#r do
  r[i] = string.char(r[i])
end
return table.concat(r):reverse()
end


files = open("BinOut.bin", "wb")

for i = 1, #str do
	rev = tobits(string.byte(dec[i]))--reversed string
	files:write(res .. " ")
end

files:close()
